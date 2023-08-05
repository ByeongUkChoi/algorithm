defmodule Solution do
  @spec is_power_of_three(n :: integer) :: boolean
  def is_power_of_three(n) when n > 1 do
    if rem(n, 3) == 0 do
      is_power_of_three(trunc(n / 3))
    else
      false
    end
  end

  def is_power_of_three(1) do
    true
  end

  def is_power_of_three(_) do
    false
  end
end
