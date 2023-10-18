defmodule Solution do
  @spec create_target_array(nums :: [integer], index :: [integer]) :: [integer]
  def create_target_array(nums, index) do
    nums
    |> Enum.zip(index)
    |> Enum.reduce([], fn {n, i}, acc ->
      List.insert_at(acc, i, n)
    end)
  end
end
