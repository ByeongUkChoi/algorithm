defmodule Solution do
  @spec find_duplicate(nums :: [integer]) :: integer
  def find_duplicate(nums) do
    nums |> Enum.frequencies() |> Enum.find_value(fn {num, f} -> f >= 2 and num end)
  end
end
