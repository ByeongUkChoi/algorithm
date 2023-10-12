defmodule Solution do
  @spec contains_nearby_duplicate(nums :: [integer], k :: integer) :: boolean
  def contains_nearby_duplicate(nums, k) do
    find_nearby_dup(nums, k)
  end

  defp find_nearby_dup(nums, k, idx \\ 0, prev_map \\ %{})

  defp find_nearby_dup([], _k, _idx, _prev_map) do
    false
  end

  defp find_nearby_dup([h | t], k, idx, prev_map) do
    prev_idx = Map.get(prev_map, h)

    if prev_idx && k >= idx - prev_idx do
      true
    else
      new_prev_map = Map.put(prev_map, h, idx)
      find_nearby_dup(t, k, idx + 1, new_prev_map)
    end
  end
end
