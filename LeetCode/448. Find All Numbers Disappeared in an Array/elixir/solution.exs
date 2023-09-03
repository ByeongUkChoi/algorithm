defmodule Solution do
  @spec find_disappeared_numbers(nums :: [integer]) :: [integer]
  def find_disappeared_numbers(nums) do
    Enum.to_list(1..length(nums)) -- nums
  end
end
