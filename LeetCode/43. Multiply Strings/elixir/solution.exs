defmodule Solution do
  @spec multiply(num1 :: String.t(), num2 :: String.t()) :: String.t()
  def multiply(num1, num2) do
    "#{String.to_integer(num1) * String.to_integer(num2)}"
  end
end
