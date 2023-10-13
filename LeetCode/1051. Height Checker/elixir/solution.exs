defmodule Solution do
  @spec height_checker(heights :: [integer]) :: integer
  def height_checker(heights) do
    heights
    |> Enum.zip(Enum.sort(heights))
    |> Enum.count(fn {h1, h2} -> h1 != h2 end)
  end
end
