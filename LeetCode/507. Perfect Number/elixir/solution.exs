defmodule Solution do
  @spec check_perfect_number(num :: integer) :: boolean
  def check_perfect_number(num) do
    2..floor(:math.sqrt(num))
    |> Enum.reduce(1, fn n, acc ->
      if rem(num, n) == 0 do
        acc + n + div(num, n)
      else
        acc
      end
    end)
    |> then(&(&1 == num))
  end
end
