defmodule Solution do
  @spec contains_duplicate(nums :: [integer]) :: boolean
  def contains_duplicate(nums) do
    nums |> Enum.frequencies() |> Enum.any?(&(elem(&1, 1) > 1))
  end
end
