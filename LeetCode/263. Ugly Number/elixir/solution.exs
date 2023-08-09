defmodule Solution do
  @spec is_ugly(n :: integer) :: boolean
  def is_ugly(n) when n <= 0 do
    false
  end

  def is_ugly(1) do
    true
  end

  def is_ugly(n) do
    cond do
      rem(n, 2) == 0 -> is_ugly(div(n, 2))
      rem(n, 3) == 0 -> is_ugly(div(n, 3))
      rem(n, 5) == 0 -> is_ugly(div(n, 5))
      true -> false
    end
  end
end
