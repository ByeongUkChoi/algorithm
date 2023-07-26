defmodule Solution do
  @spec add_binary(a :: String.t(), b :: String.t()) :: String.t()
  def add_binary(a, b) do
    (string_to_binary(a) + string_to_binary(b)) |> integer_to_binary_string()
  end

  defp string_to_binary(s) do
    {number, _} = Integer.parse(s, 2)
    number
  end

  defp integer_to_binary_string(n) do
    Integer.to_string(n, 2)
  end
end
