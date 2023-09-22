defmodule Solution do
  @spec third_max(nums :: [integer]) :: integer
  def third_max(nums) do
    sorted_nums = nums |> Enum.uniq() |> Enum.sort(:desc)
    Enum.at(sorted_nums, 2, hd(sorted_nums))
  end
end
