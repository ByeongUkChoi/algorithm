defmodule Solution do
  @spec word_break(s :: String.t(), word_dict :: [String.t()]) :: boolean
  def word_break(s, word_dict) do
    s_length = String.length(s)

    Enum.reduce(0..(s_length - 1), %{-1 => true}, fn i, acc ->
      if Map.get(acc, i - 1) do
        s
        |> String.slice(i..(s_length - 1))
        |> matched_words_length(i, word_dict, acc)
      else
        acc
      end
    end)
    |> Map.get(s_length - 1, false)
  end

  defp matched_words_length(s, _i, word_dict, dp) when s == "" or word_dict == [] do
    dp
  end

  defp matched_words_length(s, i, [word | rest], dp) do
    word_length = String.length(word)

    new_dp =
      if String.slice(s, 0, word_length) == word do
        Map.put(dp, i + word_length - 1, true)
      else
        dp
      end

    matched_words_length(s, i, rest, new_dp)
  end
end
