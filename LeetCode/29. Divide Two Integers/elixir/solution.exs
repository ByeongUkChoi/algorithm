defmodule Solution do
  @spec divide(dividend :: integer, divisor :: integer) :: integer
  def divide(dividend, divisor) do
    dividend
    |> div(divisor)
    |> trunc()
    |> case do
      v when v > 2_147_483_647 -> 2 ** 31 - 1
      v when v < -2_147_483_648 -> -2 ** 31
      other -> other
    end
  end
end
