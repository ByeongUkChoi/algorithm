defmodule Solution do
  @spec group_anagrams(strs :: [String.t()]) :: [[String.t()]]
  def group_anagrams(strs) do
    strs
    |> Enum.group_by(&(&1 |> to_charlist() |> Enum.sort()))
    |> Map.values()
    |> Enum.sort_by(&length/1)
  end
end
