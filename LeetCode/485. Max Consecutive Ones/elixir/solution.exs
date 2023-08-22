defmodule Solution do
  @spec find_max_consecutive_ones(nums :: [integer]) :: integer
  def find_max_consecutive_ones(nums) do
    nums
    |> Enum.reduce({0, []}, fn
      0, {sum, acc} -> {0, [sum | acc]}
      1, {sum, acc} -> {sum + 1, acc}
    end)
    |> then(fn {sum, acc} -> [sum | acc] end)
    |> Enum.max()
  end
end
