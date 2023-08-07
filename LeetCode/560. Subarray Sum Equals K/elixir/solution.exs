defmodule Solution do
  @spec subarray_sum(nums :: [integer], k :: integer) :: integer
  def subarray_sum(nums, k) do
    Enum.reduce(nums, {0, 0, %{0 => 1}}, fn num, {result, prev_sum, acc} ->
      sum = prev_sum + num
      new_result = result + Map.get(acc, sum - k, 0)
      new_acc = Map.update(acc, sum, 1, &(&1 + 1))
      {new_result, sum, new_acc}
    end)
    |> elem(0)
  end
end
