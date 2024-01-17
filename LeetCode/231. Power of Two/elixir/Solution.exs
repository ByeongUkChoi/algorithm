defmodule Solution do
  @spec is_power_of_two(n :: integer) :: boolean
  def is_power_of_two(n) when n == 1 do
    true
  end

  def is_power_of_two(n) when rem(n, 2) == 0 do
    (n / 2) |> trunc() |> is_power_of_two()
  end

  def is_power_of_two(_n) do
    false
  end
end
