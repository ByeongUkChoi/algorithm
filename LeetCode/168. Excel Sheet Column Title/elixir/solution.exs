defmodule Solution do
  @spec convert_to_title(column_number :: integer) :: String.t()
  def convert_to_title(column_number) do
    column_number
    |> digits()
    |> Enum.map(&<<&1 + 64::utf8>>)
    |> Enum.join()
  end

  defp digits(number, acc \\ [])
  defp digits(0, []), do: [0]
  defp digits(0, acc), do: acc
  defp digits(number, acc) when rem(number, 26) == 0, do: digits(div(number - 1, 26), [26 | acc])
  defp digits(number, acc), do: digits(div(number, 26), [rem(number, 26) | acc])
end
