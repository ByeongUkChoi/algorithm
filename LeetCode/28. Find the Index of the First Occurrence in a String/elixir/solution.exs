defmodule Solution do
  @spec str_str(haystack :: String.t(), needle :: String.t()) :: integer
  def str_str(haystack, needle) do
    needle_chars = to_charlist(needle)

    haystack
    |> to_charlist()
    |> Enum.chunk_every(length(needle_chars), 1)
    |> Enum.find_index(&(&1 == needle_chars))
    |> case do
      nil -> -1
      i -> i
    end
  end
end
