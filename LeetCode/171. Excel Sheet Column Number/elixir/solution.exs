defmodule Solution do
  @spec title_to_number(column_title :: String.t()) :: integer
  def title_to_number(column_title) do
    column_title
    |> to_charlist()
    |> Enum.reverse()
    |> chats_to_num()
  end

  defp chats_to_num(chars, digit \\ 0, acc \\ 0)

  defp chats_to_num([], _digit, acc) do
    acc
  end

  defp chats_to_num([h | t], digit, acc) do
    chats_to_num(t, digit + 1, (h - 64) * trunc(:math.pow(26, digit)) + acc)
  end
end
