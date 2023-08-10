defmodule Solution do
  @spec missing_number(nums :: [integer]) :: integer
  def missing_number(nums) do
    0..length(nums) |> Enum.to_list() |> Kernel.--(nums) |> hd()
  end
end
