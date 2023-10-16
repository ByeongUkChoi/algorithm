defmodule Solution do
  @spec replace_elements(arr :: [integer]) :: [integer]
  def replace_elements(arr) do
    arr
    |> Enum.reverse()
    |> Enum.reduce([max: -1, acc: []], fn num, max: max, acc: acc ->
      [max: max(num, max), acc: [max | acc]]
    end)
    |> Keyword.get(:acc)
  end
end
