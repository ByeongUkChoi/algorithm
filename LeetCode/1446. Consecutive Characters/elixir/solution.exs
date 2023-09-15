defmodule Solution do
  @spec max_power(s :: String.t()) :: integer
  def max_power(s) do
    [h | t] = to_charlist(s)

    t
    |> Enum.reduce([char: h, length: 1, max_length: 1], fn char,
                                                           char: prev_char,
                                                           length: length,
                                                           max_length: max_length ->
      if prev_char == char do
        [char: char, length: length + 1, max_length: max(max_length, length + 1)]
      else
        [char: char, length: 1, max_length: max(max_length, length)]
      end
    end)
    |> Keyword.get(:max_length)
  end
end
