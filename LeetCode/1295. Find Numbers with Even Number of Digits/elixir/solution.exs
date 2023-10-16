defmodule Solution do
  @spec find_numbers(nums :: [integer]) :: integer
  def find_numbers(nums) do
    nums
    |> Enum.count(fn num ->
      "#{num}" |> String.length() |> rem(2) |> Kernel.==(0)
    end)
  end
end
