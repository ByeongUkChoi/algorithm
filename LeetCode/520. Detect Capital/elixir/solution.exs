defmodule Solution do
  @spec detect_capital_use(word :: String.t()) :: boolean
  def detect_capital_use(word) do
    word == String.upcase(word) or word == String.downcase(word) or
      word == String.capitalize(word)
  end
end
