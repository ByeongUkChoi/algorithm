defmodule Solution do
  @spec find_complement(num :: integer) :: integer
  def find_complement(num) do
    num
    |> Integer.to_string(2)
    |> String.codepoints()
    |> Enum.map(fn
      "1" -> "0"
      "0" -> "1"
    end)
    |> Enum.join()
    |> String.to_integer(2)
  end
end
