defmodule Solution do
  @spec word_pattern(pattern :: String.t(), s :: String.t()) :: boolean
  def word_pattern(pattern, s) do
    patterns = to_charlist(pattern)
    words = String.split(s)

    mapping =
      Enum.zip(patterns, words)
      |> Enum.reduce(%{}, fn {p, word}, acc ->
        Map.put_new(acc, p, word)
      end)
      |> Map.new(fn {k, v} -> {v, k} end)

    Enum.map(words, &Map.get(mapping, &1)) == patterns
  end
end
