defmodule Solution do
  @spec bitwise_complement(n :: integer) :: integer
  def bitwise_complement(n) do
    n |> ones_complement() |> Integer.parse(2) |> elem(0)
  end

  defp ones_complement(n) do
    n
    |> Integer.to_string(2)
    |> String.graphemes()
    |> Enum.map(&complement_bit/1)
    |> Enum.join()
  end

  defp complement_bit("0"), do: "1"
  defp complement_bit("1"), do: "0"
end
