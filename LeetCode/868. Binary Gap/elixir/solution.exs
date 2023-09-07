defmodule Solution do
  @spec binary_gap(n :: integer) :: integer
  def binary_gap(n) do
    n
    |> Integer.to_string(2)
    |> to_charlist()
    |> Enum.reduce([current_gap: 0, max_gap: 0], fn
      ?1, current_gap: current_gap, max_gap: max_gap ->
        [current_gap: 1, max_gap: max(current_gap, max_gap)]

      ?0, current_gap: current_gap, max_gap: max_gap ->
        [current_gap: current_gap + 1, max_gap: max_gap]
    end)
    |> Keyword.get(:max_gap)
  end
end
