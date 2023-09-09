defmodule Solution do
  @spec find_length_of_lcis(nums :: [integer]) :: integer
  def find_length_of_lcis([h | t] = _nums) do
    t
    |> Enum.reduce([seq: [h], max: 0], fn num, seq: seq, max: max_length ->
      if num > hd(seq) do
        [seq: [num | seq], max: max_length]
      else
        [seq: [num], max: max(max_length, length(seq))]
      end
    end)
    |> then(fn seq: seq, max: max_length -> max(max_length, length(seq)) end)
  end
end
