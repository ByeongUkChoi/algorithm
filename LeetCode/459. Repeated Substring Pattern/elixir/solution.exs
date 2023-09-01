defmodule Solution do
  @spec repeated_substring_pattern(s :: String.t()) :: boolean
  def repeated_substring_pattern(s) do
    s
    |> to_charlist()
    |> repeated_subsring()
  end

  defp repeated_subsring(chars) do
    chars_length = length(chars)
    repeated_subsring(chars, chars_length, div(chars_length, 2))
  end

  defp repeated_subsring(_chars, _chars_length, 0) do
    false
  end

  defp repeated_subsring(chars, chars_length, l) when rem(chars_length, l) != 0 do
    repeated_subsring(chars, chars_length, l - 1)
  end

  defp repeated_subsring(chars, chars_length, l) do
    [h | rest] = Enum.chunk_every(chars, l)

    if Enum.any?(rest, &(&1 != h)) do
      repeated_subsring(chars, chars_length, l - 1)
    else
      true
    end
  end
end
