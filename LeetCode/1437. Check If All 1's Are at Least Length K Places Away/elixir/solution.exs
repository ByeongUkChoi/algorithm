defmodule Solution do
  @spec k_length_apart(nums :: [integer], k :: integer) :: boolean
  def k_length_apart(nums, k) do
    nums
    |> Enum.reduce([current_count: 0, acc: []], fn
      1, current_count: count, acc: acc -> [current_count: 0, acc: [count | acc]]
      0, current_count: count, acc: acc -> [current_count: count + 1, acc: acc]
    end)
    |> Keyword.get(:acc)
    |> List.delete_at(-1)
    |> Enum.all?(&(&1 >= k))
  end
end
