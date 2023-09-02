defmodule Solution do
  @spec is_perfect_square(num :: integer) :: boolean
  def is_perfect_square(num) do
    num |> :math.sqrt() |> then(&(trunc(&1) == &1))
  end
end
