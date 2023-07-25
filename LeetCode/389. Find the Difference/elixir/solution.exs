defmodule Solution do
  @spec find_the_difference(s :: String.t(), t :: String.t()) :: char
  def find_the_difference(s, t) do
    (to_charlist(t) -- to_charlist(s)) |> hd()
  end
end
