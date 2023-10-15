defmodule Solution do
  @spec reverse_words(s :: String.t()) :: String.t()
  def reverse_words(s) do
    s
    |> String.split()
    |> Enum.map(&String.reverse/1)
    |> Enum.join(" ")
  end
end
