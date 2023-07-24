defmodule Solution do
  @spec is_anagram(s :: String.t(), t :: String.t()) :: boolean
  def is_anagram(s, t) do
    s |> String.to_charlist() |> Enum.frequencies() ==
      t |> String.to_charlist() |> Enum.frequencies()
  end
end
