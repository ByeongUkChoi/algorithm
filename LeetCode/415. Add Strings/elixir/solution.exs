defmodule Solution do
  @spec add_strings(num1 :: String.t(), num2 :: String.t()) :: String.t()
  def add_strings(num1, num2) do
    (String.to_integer(num1) + String.to_integer(num2)) |> to_string()
  end
end
