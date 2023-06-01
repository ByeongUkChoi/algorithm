defmodule Solution do
  @spec reverse(x :: integer) :: integer
  def reverse(x) do
    x
    |> Integer.digits()
    |> Enum.reverse()
    |> Integer.undigits()
    |> then(fn result ->
      if result < -2_147_483_648 or result > 2_147_483_647 do
        0
      else
        result
      end
    end)
  end
end
