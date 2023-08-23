defmodule Solution do
  @spec search(nums :: [integer], target :: integer) :: boolean
  def search(nums, target) do
    Enum.member?(nums, target)
  end
end
