defmodule Solution do
  @spec is_acronym(words :: [String.t()], s :: String.t()) :: boolean
  def is_acronym(words, s) do
    words
    |> Enum.map(&String.slice(&1, 0, 1))
    |> Enum.join()
    |> then(&(&1 == s))
  end
end
