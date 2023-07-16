defmodule Solution do
  @spec permute_unique(nums :: [integer]) :: [[integer]]
  def permute_unique(nums) do
    nums |> permute() |> Enum.uniq()
  end

  def permute([]), do: [[]]
  def permute(list), do: for(elem <- list, rest <- permute(list -- [elem]), do: [elem | rest])
end
