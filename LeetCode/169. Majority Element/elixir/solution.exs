defmodule Solution do
  @spec majority_element(nums :: [integer]) :: integer
  def majority_element(nums) do
    nums |> Enum.frequencies() |> Enum.max_by(&elem(&1, 1)) |> elem(0)
  end
end
