defmodule Solution do
  @spec count_negatives(grid :: [[integer]]) :: integer
  def count_negatives(grid) do
    Enum.reduce(grid, 0, fn nums, acc -> acc + Enum.count(nums, &(&1 < 0)) end)
  end
end
