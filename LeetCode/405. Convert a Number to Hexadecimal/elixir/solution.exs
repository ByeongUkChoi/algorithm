defmodule Solution do
  @spec to_hex(num :: integer) :: String.t()
  def to_hex(num) when num >= 0 do
    num
    |> Integer.digits(16)
    |> Enum.map(fn
      10 -> "a"
      11 -> "b"
      12 -> "c"
      13 -> "d"
      14 -> "e"
      15 -> "f"
      n -> n
    end)
    |> Enum.join()
  end

  def to_hex(num) do
    (2 ** 32 + num)
    |> to_hex()
  end
end
