defmodule Solution do
  @spec search(nums :: [integer], target :: integer) :: integer
  def search(nums, target) do
    nums
    |> Enum.find_index(&(&1 == target))
    |> case do
      nil -> -1
      i -> i
    end
  end
end
