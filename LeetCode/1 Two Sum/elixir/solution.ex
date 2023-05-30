defmodule Solution do
  def two_sum(nums, target) do
    helper(nums, target, %{}, 0)
  end

  defp helper([], _, _, _), do: []

  # key가 배열의 숫자이고 value가 index인 map을 만듬
  defp helper([head | tail], target, map, index) do
    diff = target - head

    if map[diff] do
      [map[diff], index]
    else
      updated_map = Map.update(map, head, index, fn _ -> index end)
      helper(tail, target, updated_map, index + 1)
    end
  end
end
