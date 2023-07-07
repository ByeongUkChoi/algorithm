defmodule Solution do
  @spec search(nums :: [integer], target :: integer) :: integer
  def search(nums, target) do
    case Enum.find_index(nums, &(&1 == target)) do
      nil -> -1
      i -> i
    end
  end
end
