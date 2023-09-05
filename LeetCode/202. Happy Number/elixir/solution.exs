defmodule Solution do
  @spec is_happy(n :: integer) :: boolean
  def is_happy(1) do
    true
  end

  def is_happy(n) when n in [2, 3, 4] do
    false
  end

  def is_happy(n) do
    n
    |> to_string()
    |> to_charlist()
    |> Enum.reduce(0, fn str, acc -> (str - 48) ** 2 + acc end)
    |> is_happy()
  end
end
