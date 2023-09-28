defmodule Solution do
  @spec convert_to_base7(num :: integer) :: String.t()
  def convert_to_base7(num) do
    sign = if num < 0, do: "-", else: ""
    digits = num |> abs() |> Integer.digits(7) |> Enum.join()
    sign <> digits
  end
end
