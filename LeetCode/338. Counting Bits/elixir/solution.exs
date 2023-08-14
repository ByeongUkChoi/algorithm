defmodule Solution do
  @spec count_bits(n :: integer) :: [integer]
  def count_bits(n) do
    0..n
    |> Enum.map(fn x ->
      x
      |> Integer.to_string(2)
      |> to_charlist()
      |> Enum.count(&(&1 == ?1))
    end)
  end
end
