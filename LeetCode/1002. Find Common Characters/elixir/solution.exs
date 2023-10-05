defmodule Solution do
  @spec common_chars(words :: [String.t()]) :: [String.t()]
  def common_chars([h | t] = _words) do
    t
    |> Enum.reduce(String.graphemes(h), fn word, acc ->
      word
      |> String.graphemes()
      |> intersection(acc)
    end)
  end

  defp intersection(a, b), do: a -- a -- b
end
