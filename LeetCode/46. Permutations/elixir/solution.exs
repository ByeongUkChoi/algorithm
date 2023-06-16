defmodule Solution do
  @spec permute(nums :: [integer]) :: [[integer]]
  def permute([]), do: [[]]
  def permute(list), do: for(elem <- list, rest <- permute(list -- [elem]), do: [elem | rest])
end
