defmodule Solution do
  @spec find_min(nums :: [integer]) :: integer
  def find_min(nums) do
    Enum.min(nums)
  end
end
