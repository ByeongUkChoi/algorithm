defmodule Solution do
  @spec find_words(words :: [String.t()]) :: [String.t()]
  def find_words(words) do
    chars1 = to_charlist("qwertyuiop")
    chars2 = to_charlist("asdfghjkl")
    chars3 = to_charlist("zxcvbnm")

    words
    |> Enum.filter(fn word ->
      remove_chars(word, chars1) == [] or
        remove_chars(word, chars2) == [] or
        remove_chars(word, chars3) == []
    end)
  end

  defp remove_chars(str, chars) do
    str
    |> String.downcase()
    |> to_charlist()
    |> Enum.uniq()
    |> Kernel.--(chars)
  end
end
