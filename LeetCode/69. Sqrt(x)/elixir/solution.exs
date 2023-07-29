defmodule Solution do
  @spec my_sqrt(x :: integer) :: integer
  def my_sqrt(x) do
    :math.sqrt(x) |> floor()
  end
end
